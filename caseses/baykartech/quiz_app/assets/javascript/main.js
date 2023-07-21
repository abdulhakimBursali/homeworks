let questions = [];

let answers = [];
let currentQuestionNumber = 0;
let questionTitle = document.getElementById("title");
let options = document.querySelectorAll(".options");
let labels = document.querySelectorAll(".option-label");
let timer = document.getElementById("timer");
const TIME = 30;
let intervalId = null;
let nextButton = document.getElementById("next");

/**
 * countdown
 */
function countDown(second = 30) {
  intervalId = setInterval(() => {
    timer.innerHTML = second;
    second--;

    if (second == 20) {
      options.forEach((element) => {
        element.disabled = false;
      });
      nextButton.disabled = false;
    }

    if (second == 0) {
      clearInterval(intervalId);
      saveTheAnswer();
      initApp();
    }
  }, 1000);
}

/**
 * Fetch Questions
 */
async function fetchquestions() {
  const response = await fetch("https://jsonplaceholder.typicode.com/posts");
  const data = await response.json();
  questions = data.splice(0, 10);
}

/**
 * App
 */
async function initApp() {
  if (questions.length == 0) {
    await fetchquestions();
    initApp();
  } else if (currentQuestionNumber == 10) {
    document.querySelector(".questions").style.display = "none";
    showResults();
  } else {
    setQuestion();
    countDown(TIME);
  }
}

/**
 * Set Question
 */
function setQuestion() {
  document.getElementById("title").innerText = `#Soru ${
    currentQuestionNumber + 1
  }: ${questions[currentQuestionNumber].title}`;

  for (let index = 0; index <= 3; index++) {
    let option = questions[currentQuestionNumber].body.split(" ");

    options[index].disabled = true;
    options[index].checked = false;
    options[index].value = option[index];
    labels[index].innerHTML = option[index];
  }
  nextButton.disabled = true;
  currentQuestionNumber++;
}

/**
 * Save Answers
 */
function saveTheAnswer() {
  answers.push({
    question: currentQuestionNumber,
    answer: null,
  });

  for (let index = 0; index <= 3; index++) {
    if (options[index].checked) {
      answers[currentQuestionNumber - 1].answer = options[index].value;
    }
  }
}

/**
 * Show Result
 */
function showResults() {
  let results = document.querySelector(".results");

  answers.forEach((answer) => {
    results.getElementsByTagName("tbody")[0].innerHTML += `
      <tr>
      <td>${answer.question}</td>
      <td>${answer.answer === null ? "Boş" : answer.answer}</td>
      </tr>
    `;
  });

  document.querySelector(".results").style.visibility = "visible";
}

/**
 *  Next Question
 */
function next() {
  clearInterval(intervalId);
  saveTheAnswer();
  initApp();
}

initApp();

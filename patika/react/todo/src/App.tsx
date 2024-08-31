import { useEffect, useState } from "react";
import "./App.css";
import Header from "./components/Header";
import List from "./components/List";
import Footer from "./components/Footer";

function App() {
  const [list, setList] = useState([]);
  const [todo, setTodo] = useState(null);

  const saveTodo = () => {
    setList([...list, todo]);
  };

  const destroy = (value) => {
    let newList = list?.filter((item: string) => item !== value);
    setList(newList);
  }

  return (
    <>
      <section className="todoapp">
        <Header setNewItem={setTodo} />
        <List list={list} setDestroyed={destroy}/>
        <button onClick={saveTodo}> KAYDET </button>
        <Footer />
      </section>

      <footer className="info">
        <p>Click to edit a todo</p>
        <p>
          Created by <a href="https://d12n.me/">Dmitry Sharabin</a>
        </p>
        <p>
          Part of <a href="http://todomvc.com">TodoMVC</a>
        </p>
      </footer>
    </>
  );
}

export default App;

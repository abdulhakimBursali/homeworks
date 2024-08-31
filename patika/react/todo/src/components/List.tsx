interface Props{
  list: [];
  setDestroyed: (string: value) => void;
}


function List({list, setDestroyed}: Props) {

  const destroy = (value: string) => {
    setDestroyed(value);
  }

  return (
    <section className="main">
      <input className="toggle-all" type="checkbox" />
      <label htmlFor="toggle-all">Mark all as complete</label>

      <ul className="todo-list">
        {list?.map((item) => (
              <li>
              <div className="view">
                <input className="toggle" type="checkbox" />
                <label>{item}</label>
                <button className="destroy" onClick={() => destroy(item)}></button>
              </div>
            </li>
        ))}
      </ul>
    </section>
  );
}

export default List;


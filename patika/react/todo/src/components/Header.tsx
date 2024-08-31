interface Props {
  setNewItem: (string: value) => void;
}

function Header({ setNewItem }: Props) {
  const changedInputValue = (e: React.ChangeEvent<HTMLInputElement>) => {
    if (e.target.value.length > 0) {
      setNewItem(e.target.value);
    } else {
      setNewItem(null);
    }
  };

  return (
    <header className="header">
      <h1>todos</h1>
      <form>
        <input
          className="new-todo"
          placeholder="What needs to be done?"
          autoFocus
          onChange={changedInputValue}
        />
      </form>
    </header>
  );
}

export default Header;

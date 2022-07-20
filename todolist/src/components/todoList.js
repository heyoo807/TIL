import styled from 'styled-components'
import TodoItem from './todoItem'
import { UseTodoState } from './todoContext'

const TodoListBlock = styled.div`
  flex: 1;
  padding: 20px 32px;
  padding-bottom: 48px;
  overflow-y: auto;
  //   background: gray;
`
const TodoList = () => {
  const todos = UseTodoState()
  return (
    <TodoListBlock>
      {todos.map((todo) => (
        <TodoItem
          key={todo.id}
          id={todo.id}
          text={todo.text}
          done={todo.done}
        />
      ))}
    </TodoListBlock>
  )
}

export default TodoList

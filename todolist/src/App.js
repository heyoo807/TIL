import './App.css'
import { createGlobalStyle } from 'styled-components'
import TodoTemplate from './components/todoTemplate'
import TodoHead from './components/todoHead'
import TodoList from './components/todoList'
import TodoCreate from './components/todoCreate'
import { TodoProvider } from './components/todoContext'

function App() {
  const GlobalStyle = createGlobalStyle`
    body{
      background: #e9ecef;
    }
  `
  return (
    <TodoProvider>
      <GlobalStyle />
      <TodoTemplate>
        <TodoHead />
        <TodoList />
        <TodoCreate />
      </TodoTemplate>
    </TodoProvider>
  )
}

export default App

import React, { useReducer, createContext, useContext, useRef } from 'react'

const initialTodos = [
  {
    id: 1,
    text: 'generate project',
    done: true,
  },
  {
    id: 2,
    text: 'style component',
    done: true,
  },
  {
    id: 3,
    text: 'make Context',
    done: false,
  },
  {
    id: 4,
    text: 'construct function',
    done: false,
  },
]

const todoReducer = (state, action) => {
  switch (action.type) {
    case 'CREATE':
      return state.concat(action.todo)
    case 'TOGGLE':
      return state.map((todo) =>
        todo.id === action.id ? { ...todo, done: !todo.done } : todo,
      )
    case 'REMOVE':
      return state.filter((todo) => todo.id !== action.id)
    default:
      throw new Error('Unhandled action type : ${action.type}')
  }
}

const TodoStateContext = createContext()
const TodoDispatchContext = createContext()
const TodoNextIdContext = createContext()

export const TodoProvider = ({ children }) => {
  const [state, dispatch] = useReducer(todoReducer, initialTodos)
  const nextId = useRef(5)
  return (
    <TodoStateContext.Provider value={state}>
      <TodoDispatchContext.Provider value={dispatch}>
        <TodoNextIdContext.Provider value={nextId}>
          {children}
        </TodoNextIdContext.Provider>
      </TodoDispatchContext.Provider>
    </TodoStateContext.Provider>
  )
}

export const UseTodoState = () => {
  const context = useContext(TodoStateContext)
  if (!context) {
    throw new Error('Cannot find TodoProvider')
  }
  return context
}

export const UseTodoDipsatch = () => {
  const context = useContext(TodoDispatchContext)
  if (!context) {
    throw new Error('Cannot find TodoProvider')
  }
  return context
}

export const useTodoNextId = () => {
  const context = useContext(TodoNextIdContext)
  if (!context) {
    throw new Error('cannot find TodoProvider')
  }
  return context
}

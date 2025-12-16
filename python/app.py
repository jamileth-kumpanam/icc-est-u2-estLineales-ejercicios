from sign_validator import SignValidator
from stack_sorter import StackSorter
from queue_utils import QueueUtils

def run_sign_validator():
    print("--- EJERCICIO 01: VALIDATOR ---")
    validator = SignValidator()
    cadena1 = "{[()]}" 
    cadena2 = "{[(])}" 
    
    print(f"Input: {cadena1} | Output: {validator.is_valid(cadena1)}")
    print(f"Input: {cadena2} | Output: {validator.is_valid(cadena2)}")
    print()

def run_stack_sorter():
    print("--- EJERCICIO 02: STACK SORTER ---")
    sorter = StackSorter()
    
    stack = [2, 4, 1, 5] 
    
    print(f"Stack Original (Fondo -> Tope): {stack}")
    
    sorter.sort_stack(stack)
    
    print(f"Stack Ordenado (Fondo -> Tope): {stack}")
    
    if stack:
        print(f"Tope actual: {stack[-1]}")
    print()

def run_queue_palindrome():
    print("--- EJERCICIO 03: PALINDROMO QUEUE ---")
    q_utils = QueueUtils()
    
    inputs = ["ana", "radar", "java"]
    
    for word in inputs:
        print(f"Input: {word} \t| Es palindromo? {q_utils.is_palindrome(word)}")
    print()

if __name__ == "__main__":
    run_sign_validator()
    run_stack_sorter()
    run_queue_palindrome()
    
from collections import deque

class QueueUtils:

    def is_palindrome(self, text: str) -> bool:
        cola_original = deque()
        cola_invertida = deque()

        for char in text:
            
            cola_original.append(char)

            cola_aux = deque()
            
            cola_aux.append(char)
            
            while cola_invertida:
                cola_aux.append(cola_invertida.popleft())
            
            cola_invertida = cola_aux

        while cola_original:
            if cola_original.popleft() != cola_invertida.popleft():
                return False
        
        return True
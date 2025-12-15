class SignValidator:

    def is_valid (self, text: str) -> bool:
        stack = []

        for char in text:
            if char == '(' or char == '{' or char == '[':
                stack.append(char)
            elif char == ')' or char == '}' or char == ']':
                if not stack:
                    return False
                #que pase si no esta vacio?
                #comparo el char con el ultimo
                #de la pila
                #si son del mismo tipo lo saco y avanzo
                #si son de otro return FALSE
                top = stack.pop()
                if (char == ')' and top != '(') or \
                   (char == '}' and top != '{') or \
                   (char == ']' and top != '['):
                    return False
                
        return len(stack) == 0
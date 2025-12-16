class SignValidator:

    def is_valid(self, text: str) -> bool:
        stack = []
        
        pairs = {')': '(', ']': '[', '}': '{'}

        for char in text:
            if char in "({[":
                stack.append(char)
            elif char in ")}]":
                if not stack:
                    return False
                
                top = stack.pop()
                
                if top != pairs[char]:
                    return False
                
        return len(stack) == 0
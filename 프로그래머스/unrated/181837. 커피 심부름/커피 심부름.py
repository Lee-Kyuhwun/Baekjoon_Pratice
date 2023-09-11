def solution(order):
    # Define the prices of the drinks
    AMERICANO_PRICE = 4500
    LATTE_PRICE = 5000
    # Total cost
    total_cost = 0
    
    # Check each order and add the corresponding price
    for drink in order:
        if drink in ["iceamericano", "americanoice", "americano", "anything"]:
            total_cost += AMERICANO_PRICE
        elif drink in ["icecafelatte", "cafelatteice", "cafelatte"]:
            total_cost += LATTE_PRICE
        elif drink in ["hotamericano", "americanohot"]:
            total_cost += AMERICANO_PRICE
        elif drink in ["hotcafelatte", "cafelattehot"]:
            total_cost += LATTE_PRICE
            
    return total_cost
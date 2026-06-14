# Ask for input and store in variables
first_name = input("What is your first name? ")
last_name = input("What is your last name? ")
age = int(input("How old are you? "))
favorite_color = input("What is your favorite color? ")
hometown = input("What is your hometown? ")

# Display introduction using f-strings
print("\n--- Your Introduction Card ---\n")

print(f"Name: {first_name} {last_name}")
print(f"Age: {age}")
print(f"Favorite color: {favorite_color}")
print(f"Hometown: {hometown}")
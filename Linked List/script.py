import os

q_number = input("Enter Question Number:")
folder_name = input("Enter folder name: ")
java_file_name = folder_name.replace(" ", "")
folder_name = q_number + " " + folder_name
if not os.path.exists(folder_name):
    os.makedirs(folder_name)
    print(f"Folder '{folder_name}' created successfully!")
else:
    print(f"Folder '{folder_name}' already exists!")

# Create Question.md file
with open(os.path.join(folder_name, "Question.md"), "w") as f:
    f.write(f"## {folder_name}")
# Create .java file with the same name as the folder name
with open(os.path.join(folder_name, f"{java_file_name}.java"), "w") as f:
    f.write("class " + java_file_name.title() + " {\n\n}")
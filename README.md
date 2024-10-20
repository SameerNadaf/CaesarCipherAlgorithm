# 🔐 Simple Caesar Cipher Algorithm

This Java project implements a simple Caesar Cipher algorithm for both encryption and decryption. The Caesar Cipher is a basic encryption technique where each letter in the plaintext is shifted by a certain number of positions down the alphabet.

## 🚀 Getting Started

Follow these steps to set up and run the project on your local machine:

### Clone the Repository:

```bash
git clone https://github.com/SameerNadaf/CaesarCipherAlgorithm
```

### Compile the Java Code:

```bash
javac com/CaesarCipherAlgorith/Encryption/EncryptionRunner.java com/CaesarCipherAlgorith/Decryption/DecryptionRunner.java
```

### Run the Application:

```bash
java com.CaesarCipherAlgorith.Encryption.EncryptionRunner
java com.CaesarCipherAlgorith.Decryption.DecryptionRunner
```

## 📂 Project Structure

- `src/`: Contains the Java source code files.
  - `com.CaesarCipherAlgorith/`
    - `Encryption/`: Contains the encryption logic (`Encryptor.java`).
    - `Decryption/`: Contains the decryption logic (`Decryptor.java`).

## 🔑 How It Works

- **Encryption**: Shifts each letter of the plaintext by a specified number (shift key).
- **Decryption**: Reverses the encryption by shifting letters back by the same number.

## 📦 Features

- Encrypts a given plaintext with a specified shift key.
- Decrypts an encrypted message back to the original plaintext.
- Supports both uppercase and lowercase letters.

## 🌐 Technologies Used

- Java

## 📘 Example Usage

```bash
Enter the plaintext: HELLO
Enter the key: 3
Encrypted text: KHOOR
Decrypted text: HELLO
```

## 🤝 Contributing

Contributions are welcome! Feel free to submit issues and pull requests.

## Happy coding! 🎉

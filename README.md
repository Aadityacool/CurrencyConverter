# 💱 Currency Converter - Java

A simple console-based currency converter built in Java. It allows users to convert an amount from one currency to another using predefined exchange rates.

---

## 📌 Features

- Convert between 6 major currencies:
  - USD (US Dollar)
  - EUR (Euro)
  - INR (Indian Rupee)
  - GBP (British Pound)
  - JPY (Japanese Yen)
  - NPR (Nepalese Rupee)
- Simple and interactive terminal interface
- Basic input validation
- Uses static exchange rates

---

## 💡 How It Works

- Exchange rates are stored in an array relative to USD.
- User selects a source and target currency from the menu.
- User inputs the amount to convert.
- Formula used:
- Converted=(amount/fromRate)* toRate

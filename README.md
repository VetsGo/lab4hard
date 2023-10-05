# Лабораторна робота 1

## Функціональність програми:
**Існують зашифровані повідомлення в дивних шаблонах, які потребують декодування. Написати програму, яка розшифровує ці повідомлення**

**Програма повинна вміти:**
Виявляти метод кодування (Кодування заміни голосних чи Кодування заміни приголосних) та декодувати відповідно

## Опис роботи:

1. Створюємо клас `Decoder` з двома статичними методами `decodeVowelReplacement` та `decodeConsonantReplacement` (ще є готовий метод `main`).
2. В методі `decodeVowelReplacement` реалізовуємо кодування заміни голосних за допомогою `StringBuilder`.
3. В методі `decodeConsonantReplacement` реалізовуємо кодування заміни приголосних за допомогою `StringBuilder`.
4. В методі `main` за допомогою регулярних виразів дізнаємос яким методом кодування було зашифроване слово, та виводимо декодований результат.
5. Робимо тести для перевірки роботи програми з декодуванням.

# Висновок:
Створював тести до написаної програми
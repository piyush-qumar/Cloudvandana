// Get the display element.
const display = document.getElementById("display");

// Add event listeners to all the buttons.
document.querySelectorAll("button").forEach((button) => {
  button.addEventListener("click", () => {
    const value = button.value;

    if (/\d/.test(value)) {
      // Append digits to the display.
      display.value += value;
    } else if (
      value === "+" ||
      value === "-" ||
      value === "*" ||
      value === "/"
    ) {
      // Append operators to the display.
      display.value += value;
    } else if (value === "=") {
      try {
        // Evaluate the expression and update the display.
        const result = eval(display.value);
        display.value = result;
      } catch (error) {
        // Handle errors during evaluation.
        display.value = "Error";
      }
    } else if (value === "C") {
      // Clear the display.
      display.value = "";
    }
  });
});

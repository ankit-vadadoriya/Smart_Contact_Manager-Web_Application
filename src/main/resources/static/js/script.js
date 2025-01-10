console.log("Script loaded");

//change theme work
let currentTheme = getTheme();

document.addEventListener('DOMContentLoaded', () => {
    changeTheme();
});

//TODO :
function changeTheme(){
    //set to web page
    document.querySelector('html').classList.add(currentTheme);
    //set the listener to change theme button
    const changeThemeButton = document.querySelector("#theme_change_button");
    //change the text of button
    changeThemeButton.querySelector("span").textContent = currentTheme === "light"?"Dark":"Light";

    changeThemeButton.addEventListener("click", (event) => {
        console.log("Change button click");
        const oldTheme = currentTheme;
        currentTheme = currentTheme === "dark" ? "light" : "dark";
        // Update localStorage with the new theme
        setTheme(currentTheme);
        //remove the currentTheme
        document.querySelector('html').classList.remove(oldTheme);
        //set the currentTheme
        document.querySelector('html').classList.add(currentTheme);
        changeThemeButton.querySelector("span").textContent = currentTheme === "light" ? "Dark" : "Light";
    });
}

//set theme to localstorage
function setTheme(theme){
    localStorage.setItem("theme", theme);
}

//get theme from localstorage
function getTheme(){
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}
//end of page change theme

// navbar
document.addEventListener("DOMContentLoaded", () => {
  const navLinks = document.querySelectorAll(".nav-link");
  const currentPath = window.location.pathname;
  const isDarkMode = document.body.classList.contains('dark'); // Check if dark mode is active

  navLinks.forEach(link => {
    // Change text color and background color based on dark mode and current path
    if (link.getAttribute("href") === currentPath) {
      // Highlight the active link
      link.classList.add("text-blue-700", "dark:text-blue-500");
      link.style.fontSize = "1.1rem";
      
      // Apply background color in dark mode
      if (isDarkMode) {
        link.classList.add("bg-gray-800");
      }
    } else {
      // Reset font size for non-active links
      link.style.fontSize = "";
      link.classList.remove("text-blue-700", "dark:text-blue-500", "bg-gray-800");
    }
  });
});

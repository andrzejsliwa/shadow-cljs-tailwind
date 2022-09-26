/** @type {import('tailwindcss').Config} */
const defaultTheme = require('tailwindcss/defaultTheme')

module.exports = {
  content: {
    files: ["./public/index.html","./src/**/*.cljs"],
    // extract: {
    //   cljs: content => content.match(/[^<>"'.`\s]*[^<>"'.`\s:]/g)
    // }
  },
  theme: {
    extend: {
      fontFamily: {
        // serif: ['Bungee Spice', 'Georgia'],
        sans: ['Inter var', ...defaultTheme.fontFamily.sans],
      },
    },
  },
  plugins: [
    require('@tailwindcss/forms'),
    require('@tailwindcss/aspect-ratio'),
  ],
}
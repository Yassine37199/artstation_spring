module.exports = {
  mode : 'jit',
  purge: ['./src/**/*.{ts,tsx}', './public/index.html'],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      colors : {
        primary : '#3ABEFF',
        secondary : '#D84797',
        tertiary : '#26FFE6',
        gray : {
            900 : '#101010',
            800 : '#171717',
            700 : '#222',
            600 : '#333',
            500 : '#747474',
            400 : '#878787',
            300 : '#9B9B9B',
            200 : '#F1F1F1',
            100 : '#FFF'
        }
      },
      fontFamily : {
        'sans' : ['"Open Sans"' , '"Helvetica Neue"' , '"Helvetica"' , '"Arial"' , 'ui-sans-serif']
      }
    },
  },
  variants: {
    extend: {},
  },
  plugins: [],
}

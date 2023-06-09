# my_blog
mern 
  MERN Ecommerce
Description

MERN Ecommerce
Description
 MERN stack, and utilizes third party API's. This enable three main different flows or implementations:

Node provides the backend environment for this application
Express middleware is used to handle requests, routes
Mongoose schemas to model the application data
React for displaying UI components
Redux to manage application's state
Redux Thunk middleware to handle asynchronous redux actions
Database Seed
The seed command will create an admin user in the database
The email and password are passed with the command as arguments
Like below command, replace brackets with email and password.
For more information, see code here
npm run seed:db [email-***@****.com] [password-******] // This is just an example.




Install
Some basic Git commands are:

$ gh repo clone GITFLOWQWERTY/lad
$ cd  blog-backend
$ npm install
Setup
 Create .env file that include:

  * MONGO_URI & JWT_SECRET
  * PORT & BASE_SERVER_URL & BASE_API_URL & BASE_CLIENT_URL
  * MAILCHIMP_KEY & MAILCHIMP_LIST_KEY => Mailchimp configuration
  * MAILGUN_KEY & MAILGUN_DOMAIN & MAILGUN_EMAIL_SENDER => Mailgun configuration
  * GOOGLE_CLIENT_ID & GOOGLE_CLIENT_SECRET & GOOGLE_CALLBACK_URL => Google Auth configuration
  * FACEBOOK_CLIENT_ID & FACEBOOK_CLIENT_SECRET & FACEBOOK_CALLBACK_URL => Facebook Auth configuration
  * AWS_ACCESS_KEY_ID & AWS_SECRET_ACCESS_KEY & AWS_REGION & AWS_BUCKET_NAME => AWS configuration
Start development
$ npm run dev
Simple build for production
$ npm run build
Run build for production
$ npm start
Languages & tools
Node

Express

Mongoose

React

Webpack

Code Formatter
Add a .vscode directory
Create a file settings.json inside .vscode
Install Prettier - Code formatter in VSCode
Add the following snippet:
    {
      "editor.formatOnSave": true,
      "prettier.singleQuote": true,
      "prettier.arrowParens": "avoid",
      "prettier.jsxSingleQuote": true,
      "prettier.trailingComma": "none",
      "javascript.preferences.quoteStyle": "single",
    }

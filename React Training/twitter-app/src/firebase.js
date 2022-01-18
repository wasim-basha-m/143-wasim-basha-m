// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
import firebase from "firebase";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyD9JWOGUmpT0iSAxYnX5lSh1wHQA4U-Zno",
  authDomain: "twitter-clone-634ac.firebaseapp.com",
  projectId: "twitter-clone-634ac",
  storageBucket: "twitter-clone-634ac.appspot.com",
  messagingSenderId: "753249375764",
  appId: "1:753249375764:web:c98a56e710439fe6567901",
  measurementId: "G-03LDJSKZZS"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);

const firebaseApp = firebase.initializeApp(firebaseConfig);

const db = firebaseApp.firestore();

export default db;
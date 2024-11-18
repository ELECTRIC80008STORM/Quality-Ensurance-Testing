const mongoose = require("mongoose");

const userSchema = new mongoose.Schema({
  username: { type: String, required: true },
  age: { type: Number, required: true },
});

// This method returns a true if the user is an adult, returns false otherwise
userSchema.methods.isAdult = function () {
  return this.age >= 18;
};

const userModel = mongoose.model("User", userSchema);
module.exports = userModel;
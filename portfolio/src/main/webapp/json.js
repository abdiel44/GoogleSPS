async function showExampleJSON()
{
  const responseFromServer = await fetch('/json');

  const jsonData = await responseFromServer.json();

  const jsonListElement = document.getElementById('json-container');

  jsonListElement.appendChild(
      createListh5('My Car'));

  jsonListElement.appendChild(
      createListElement('Brand: '  + jsonData.brand));
  jsonListElement.appendChild(
      createListElement('Model: ' + jsonData.model));
  jsonListElement.appendChild(
      createListElement('Color: ' + jsonData.color));
  jsonListElement.appendChild(
      createListElement('Year: '  + jsonData.year));
}

function createListElement(text) {
  const liElement = document.createElement('li');
  liElement.innerText = text;
  return liElement;
}
function createListh5(text) {
  const liElement = document.createElement('h5');
  liElement.innerText = text;
  return liElement;
}

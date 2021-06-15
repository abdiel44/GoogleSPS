async function showExampleJSON()
{
  const responseFromServer = await fetch('/json');

  const jsonData = await responseFromServer.json();

  const JsonListElement = document.getElementById('json-container');
  //JsonListElement.innerHTML = '';

  JsonListElement.appendChild(
      createListh5('My Car'));

  JsonListElement.appendChild(
      createListElement('Brand: '  + jsonData.brand));
  JsonListElement.appendChild(
      createListElement('Model: ' + jsonData.model));
  JsonListElement.appendChild(
      createListElement('Color: ' + jsonData.color));
  JsonListElement.appendChild(
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
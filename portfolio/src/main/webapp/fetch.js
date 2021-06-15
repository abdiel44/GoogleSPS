async function showExampleFetch() {
  const responseFromServer = await fetch('/fetch');
  const textFromResponse = await responseFromServer.text();

  const fetchContainer = document.getElementById('fetch-container');
  fetchContainer.innerText = textFromResponse;
}
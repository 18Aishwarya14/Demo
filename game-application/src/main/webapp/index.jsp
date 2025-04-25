
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Simple Game App</title>
  <style>
    * {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
      font-family: 'Segoe UI', sans-serif;
    }

    body {
      background: #111;
      color: #fff;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .game-container {
      width: 90%;
      max-width: 600px;
      padding: 20px;
      background-color: #222;
      border-radius: 15px;
      box-shadow: 0 0 15px rgba(0, 255, 255, 0.3);
      text-align: center;
    }

    header {
      margin-bottom: 20px;
    }

    header h1 {
      font-size: 2.5rem;
      color: #0ff;
    }

    .score {
      margin-top: 10px;
      font-size: 1.2rem;
    }

    .game-area {
      background-color: #333;
      height: 300px;
      border: 2px dashed #0ff;
      border-radius: 10px;
      margin: 20px 0;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    footer button {
      padding: 10px 20px;
      font-size: 1rem;
      background-color: #0ff;
      color: #111;
      border: none;
      border-radius: 8px;
      cursor: pointer;
      transition: background 0.3s;
    }

    footer button:hover {
      background-color: #00cccc;
    }
  </style>
</head>
<body>
  <div class="game-container">
    <header>
      <h1>My Game</h1>
      <div class="score">Score: <span id="score">0</span></div>
    </header>

    <main class="game-area">
      <!-- Game elements go here -->
      <p>Game content appears here</p>
    </main>

    <footer>
      <button id="start-btn">Start Game</button>
    </footer>
  </div>

  <script>
    // Basic example logic
    let score = 0;
    const scoreDisplay = document.getElementById("score");
    const startBtn = document.getElementById("start-btn");

    startBtn.addEventListener("click", () => {
      score = 0;
      scoreDisplay.textContent = score;
      alert("Game Started!");
      // Add your game logic here
    });
  </script>
</body>
</html>

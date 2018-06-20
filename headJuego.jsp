	<style>
		canvas {
			border: 1px solid;
		}
		#contenedor {
			position: relative;
			width: 1000px;
			height: 400px;
		}
		#modal {
			position: absolute;
			width: 100%;
			height: 100%;
			top: 0px;
			left: 0px;
			background-color: rgba(0,0,0,0.7);
		}
		#boton {
			position: absolute;
			top: 50%;
			left: 50%;
			transform: translateY(-50%) translateX(-50%);
		}
	</style>
	<body onkeyup="saltar(event);">
            <div class="contenedor">
            <div class="contenedor2">
		<div id="contenedor">
                    <canvas width="1000" height="400" id="canvas" style="background-color:lightblue;">
		</canvas>
		<div id="modal">
			<button id="boton" onclick="iniciar();">
				<img src="imagenes/play.png" id="imgbtn" />
			</button>
		</div>
		
            
		<script src="js.js"></script>
                </div>
            </div>
            </div>
	</body>
<script lang="ts">
	export let name = '';
	$: response = '';
	let counter = 0;
	
	async function serverGreeting() {
	  const param = (name)?name:"World";
	  const resp = await fetch(`/hello/`+name);
	  const greeting = await resp.text();
	  response = `${greeting} (call #${++counter})`;
	}
</script>

<main>
	<input bind:value={name}>
	<h1>Welcome {name}!</h1>
	<p>Visit <a href="https://quarkus.io/">Quarkus.io</a> to learn how to build Supersonic Subatomic Java apps.</p>
	<p>Visit the <a href="https://svelte.dev/tutorial">Svelte tutorial</a> to learn how to build Svelte apps.</p>
	<button on:click={serverGreeting}>
		Server says what?
	</button>
	
	<h3>{response}</h3>
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}
	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}
	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
	h3 {
		color: #6f32be;
		font-size: 2em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>
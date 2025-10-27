CPC App - Catálogo de Peças de Computador

Um aplicativo web moderno para catálogo de peças de computador com suporte a múltiplos idiomas e temas.

✨ Características Principais
	🌐 Suporte Multi-idioma: Português e Inglês
	🎨 Temas: Modo escuro e claro
	📱 Design Nativo Android: Interface fluida e responsiva
	🔍 Catálogo Organizado: Visualização fácil das peças de PC
	📋 Detalhes Completos: Activity dedicada para cada componente
	📤 Compartilhamento: Funcionalidade nativa de compartilhar peças
	⚡ Performance Otimizada: Desempenho suave com Kotlin

✨Tecnologias Utilizadas
	Android Studio - IDE principal
	Kotlin - Linguagem de programação (100%)
	XML - Layout das interfaces
	Android SDK - Framework nativo
	Material Design - Componentes de UI modernos

✨Activities Principais
	MainActivity - Lista principal do catálogo
	PartDetailActivity - Tela de detalhes das peças
	SettingsActivity - Configurações de tema e idioma

✨Estrutura do Projeto

app/
├── src/main/
│   ├── java/com/example/cpcapp/
│   │   ├── ui/
│   │   │   ├── MainActivity.kt
│   │   │   └── DetalhesActivity.kt
│   │   ├── adapter/
│   │   │   └── PecaAdapter.kt
│   │   └── model/
│   │       └── Peca.kt
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml
│   │   │   ├── activity_detalhes.xml
│   │   │   └── item_peca.xml
│   │   ├── values/
│   │   │   ├── strings.xml (inglês)
│   │   │   └── colors.xml
│   │   ├── values-pt-rBR/
│   │   │   └── strings.xml (português)
│   │   └── drawable/
│   │       ├── processador.png
│   │       ├── placa_mae.png
│   │       └── ...
│   └── AndroidManifest.xml

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
│   ├── java/com/cpc/app/
│   │   ├── MainActivity.kt
│   │   ├── PartDetailActivity.kt
│   │   ├── adapters/
│   │   │   └── PartsAdapter.kt
│   │   ├── models/
│   │   │   └── ComputerPart.kt
│   │   └── utils/
│   │   	├── ThemeManager.kt
│   │   	└── LanguageManager.kt
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml
│   │   │   ├── activity_part_detail.xml
│   │   │   └── item_part.xml
│   │   ├── values/
│   │   │   ├── strings.xml
│   │   │   └── colors.xml
│   │   ├── values-pt/
│   │   │   └── strings.xml
│   │   ├── values-en/
│   │   │   └── strings.xml
│   │   └── drawable/
│   └── AndroidManifest.xml

package Tipos;

public enum Tipo {
    FUEGO("🔥"),
    AGUA("💧"),
    PLANTA("🌿"),
    NORMAL("👊"),
    AIRE("💨"),
    RAYO("⚡");

    private final String emoji;

    Tipo(String emoji) {//Esta funcion hace que se puedan tener emojis enves de las enumeraciones
        this.emoji = emoji;
    }

    public String getEmoji() {//este getter es para obtener el emoji
        
        return emoji;
    }
}
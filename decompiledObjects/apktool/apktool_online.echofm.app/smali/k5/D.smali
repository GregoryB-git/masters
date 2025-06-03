.class public final synthetic Lk5/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic o:Lk5/E$a;


# direct methods
.method public synthetic constructor <init>(Lk5/E$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/D;->o:Lk5/E$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/D;->o:Lk5/E$a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lk5/E$a;->a(Lk5/E$a;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

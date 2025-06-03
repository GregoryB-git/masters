.class public final Lsa/c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsa/e$a;


# direct methods
.method public constructor <init>(Lsa/e$a;)V
    .locals 0

    iput-object p1, p0, Lsa/c;->a:Lsa/e$a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.media.AUDIO_BECOMING_NOISY"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsa/c;->a:Lsa/e$a;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "onBecomingNoisy"

    invoke-virtual {p1, v0, p2}, Lsa/e$a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

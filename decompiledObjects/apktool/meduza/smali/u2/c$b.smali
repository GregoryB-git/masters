.class public final Lu2/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt2/a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lu2/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu2/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lpc/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/q<",
            "Lt2/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu2/d;Lpc/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/d<",
            "Ljava/lang/Object;",
            ">;",
            "Lpc/q<",
            "-",
            "Lt2/b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu2/c$b;->a:Lu2/d;

    iput-object p2, p0, Lu2/c$b;->b:Lpc/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lu2/c$b;->a:Lu2/d;

    invoke-virtual {v0, p1}, Lu2/d;->c(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lt2/b$b;

    iget-object v0, p0, Lu2/c$b;->a:Lu2/d;

    invoke-virtual {v0}, Lu2/d;->a()I

    move-result v0

    invoke-direct {p1, v0}, Lt2/b$b;-><init>(I)V

    goto :goto_0

    :cond_0
    sget-object p1, Lt2/b$a;->a:Lt2/b$a;

    :goto_0
    iget-object v0, p0, Lu2/c$b;->b:Lpc/q;

    invoke-interface {v0}, Lpc/q;->getChannel()Lpc/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpc/g;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

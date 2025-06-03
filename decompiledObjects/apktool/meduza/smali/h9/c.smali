.class public final Lh9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/c$a;,
        Lh9/c$b;
    }
.end annotation


# instance fields
.field public final a:Lh9/f;

.field public final b:Lh9/c$a;

.field public final c:Lh9/c$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh9/f;

    invoke-direct {v0}, Lh9/f;-><init>()V

    iput-object v0, p0, Lh9/c;->a:Lh9/f;

    new-instance v0, Lh9/c$a;

    invoke-direct {v0, p0}, Lh9/c$a;-><init>(Lh9/c;)V

    iput-object v0, p0, Lh9/c;->b:Lh9/c$a;

    new-instance v0, Lh9/c$b;

    invoke-direct {v0, p0}, Lh9/c$b;-><init>(Lh9/c;)V

    iput-object v0, p0, Lh9/c;->c:Lh9/c$b;

    return-void
.end method


# virtual methods
.method public final a(I)Lm/e;
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lh9/c;->c:Lh9/c$b;

    return-object p1

    :cond_1
    iget-object p1, p0, Lh9/c;->b:Lh9/c$a;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    throw p1
.end method

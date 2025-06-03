.class public final Ls0/f;
.super Ls0/g$a;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:I

.field public final synthetic c:Ls0/g;


# direct methods
.method public constructor <init>(Ls0/g;)V
    .locals 1

    iput-object p1, p0, Ls0/f;->c:Ls0/g;

    invoke-direct {p0}, Ls0/g$a;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ls0/f;->a:I

    invoke-virtual {p1}, Ls0/g;->size()I

    move-result p1

    iput p1, p0, Ls0/f;->b:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Ls0/f;->a:I

    iget v1, p0, Ls0/f;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

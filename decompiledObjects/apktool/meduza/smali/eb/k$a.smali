.class public final Leb/k$a;
.super Leb/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Leb/b$a;

.field public final b:Leb/s0;


# direct methods
.method public constructor <init>(Leb/b$a;Leb/s0;)V
    .locals 0

    invoke-direct {p0}, Leb/b$a;-><init>()V

    iput-object p1, p0, Leb/k$a;->a:Leb/b$a;

    iput-object p2, p0, Leb/k$a;->b:Leb/s0;

    return-void
.end method


# virtual methods
.method public final a(Leb/s0;)V
    .locals 2

    new-instance v0, Leb/s0;

    invoke-direct {v0}, Leb/s0;-><init>()V

    iget-object v1, p0, Leb/k$a;->b:Leb/s0;

    invoke-virtual {v0, v1}, Leb/s0;->d(Leb/s0;)V

    invoke-virtual {v0, p1}, Leb/s0;->d(Leb/s0;)V

    iget-object p1, p0, Leb/k$a;->a:Leb/b$a;

    invoke-virtual {p1, v0}, Leb/b$a;->a(Leb/s0;)V

    return-void
.end method

.method public final b(Leb/e1;)V
    .locals 1

    iget-object v0, p0, Leb/k$a;->a:Leb/b$a;

    invoke-virtual {v0, p1}, Leb/b$a;->b(Leb/e1;)V

    return-void
.end method

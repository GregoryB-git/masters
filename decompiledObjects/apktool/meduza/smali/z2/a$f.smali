.class public final Lz2/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final a:Lz2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/a<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final b:Ls7/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls7/e<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz2/a;Ls7/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/a<",
            "TV;>;",
            "Ls7/e<",
            "+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/a$f;->a:Lz2/a;

    iput-object p2, p0, Lz2/a$f;->b:Ls7/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz2/a$f;->a:Lz2/a;

    iget-object v0, v0, Lz2/a;->a:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz2/a$f;->b:Ls7/e;

    invoke-static {v0}, Lz2/a;->e(Ls7/e;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lz2/a;->f:Lz2/a$a;

    iget-object v2, p0, Lz2/a$f;->a:Lz2/a;

    invoke-virtual {v1, v2, p0, v0}, Lz2/a$a;->b(Lz2/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz2/a$f;->a:Lz2/a;

    invoke-static {v0}, Lz2/a;->b(Lz2/a;)V

    :cond_1
    return-void
.end method

.class public abstract Ly0/k;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final a:Lx0/i;


# direct methods
.method public constructor <init>(Lx0/i;Ljava/lang/String;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ly0/k;->a:Lx0/i;

    return-void
.end method

.class public abstract Ly2/a$a;
.super Ly2/a$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly2/a$e;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Looper;LA2/d;Ljava/lang/Object;Ly2/e$a;Ly2/e$b;)Ly2/a$f;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Ly2/a$a;->b(Landroid/content/Context;Landroid/os/Looper;LA2/d;Ljava/lang/Object;Lz2/d;Lz2/j;)Ly2/a$f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Landroid/content/Context;Landroid/os/Looper;LA2/d;Ljava/lang/Object;Lz2/d;Lz2/j;)Ly2/a$f;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p2, "buildClient must be implemented"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

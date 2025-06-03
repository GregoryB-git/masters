.class public final Ld1/b$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/q0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lb1/o0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lb1/o0;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    new-instance p1, Ld1/b$c;

    invoke-direct {p1}, Ld1/b$c;-><init>()V

    return-object p1
.end method

.method public final b(Ljava/lang/Class;Lc1/b;)Lb1/o0;
    .locals 0

    invoke-virtual {p0, p1}, Ld1/b$c$a;->a(Ljava/lang/Class;)Lb1/o0;

    move-result-object p1

    return-object p1
.end method

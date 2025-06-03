.class public final Lk0/f0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk0/F0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lx0/x;

.field public c:Ld0/I;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx0/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/f0$f;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/f0$f;->b:Lx0/x;

    .line 7
    .line 8
    invoke-virtual {p2}, Lx0/t;->Z()Ld0/I;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lk0/f0$f;->c:Ld0/I;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0$f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ld0/I;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/f0$f;->c:Ld0/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Ld0/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0$f;->c:Ld0/I;

    .line 2
    .line 3
    return-void
.end method

.class public final Lw8/c$a;
.super Lk6/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk6/a$a<",
        "Lcom/google/firebase/dynamiclinks/internal/a;",
        "Lk6/a$d$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk6/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildClient(Landroid/content/Context;Landroid/os/Looper;Lm6/a;Ljava/lang/Object;Lk6/e$a;Lk6/e$b;)Lk6/a$f;
    .locals 6

    check-cast p4, Lk6/a$d$c;

    new-instance p4, Lcom/google/firebase/dynamiclinks/internal/a;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/dynamiclinks/internal/a;-><init>(Landroid/content/Context;Landroid/os/Looper;Lm6/a;Lk6/e$a;Lk6/e$b;)V

    return-object p4
.end method

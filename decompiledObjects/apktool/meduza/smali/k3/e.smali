.class public final Lk3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lk3/p;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lk3/e;

.field public static final b:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk3/e;

    invoke-direct {v0}, Lk3/e;-><init>()V

    sput-object v0, Lk3/e;->a:Lk3/e;

    const-string v0, "clientMetrics"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lk3/e;->b:Ly8/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lk3/p;

    check-cast p2, Ly8/e;

    sget-object v0, Lk3/e;->b:Ly8/c;

    invoke-virtual {p1}, Lk3/p;->a()Ln3/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method

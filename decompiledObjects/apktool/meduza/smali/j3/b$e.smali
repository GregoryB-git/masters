.class public final Lj3/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lj3/q;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lj3/b$e;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/b$e;

    invoke-direct {v0}, Lj3/b$e;-><init>()V

    sput-object v0, Lj3/b$e;->a:Lj3/b$e;

    const-string v0, "clearBlob"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$e;->b:Ly8/c;

    const-string v0, "encryptedBlob"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$e;->c:Ly8/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lj3/q;

    check-cast p2, Ly8/e;

    sget-object v0, Lj3/b$e;->b:Ly8/c;

    invoke-virtual {p1}, Lj3/q;->a()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$e;->c:Ly8/c;

    invoke-virtual {p1}, Lj3/q;->b()[B

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method

.class public final Lj3/b$j;
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
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lj3/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lj3/b$j;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/b$j;

    invoke-direct {v0}, Lj3/b$j;-><init>()V

    sput-object v0, Lj3/b$j;->a:Lj3/b$j;

    const-string v0, "networkType"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$j;->b:Ly8/c;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lj3/b$j;->c:Ly8/c;

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

    check-cast p1, Lj3/w;

    check-cast p2, Ly8/e;

    sget-object v0, Lj3/b$j;->b:Ly8/c;

    invoke-virtual {p1}, Lj3/w;->b()Lj3/w$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lj3/b$j;->c:Ly8/c;

    invoke-virtual {p1}, Lj3/w;->a()Lj3/w$a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method

.class public Lk3/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk3/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk3/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ln3/c;Ljava/lang/String;Ljava/lang/String;)Ln3/b$a;
    .locals 0

    .line 1
    sget-object p1, Lk3/f;->a:Ln3/b$a;

    .line 2
    .line 3
    return-object p1
.end method

.class public final Lwa/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwa/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwa/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/Serializable;)V
    .locals 0

    iput-object p1, p0, Lwa/b$a;->a:Ljava/lang/Object;

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1

    const-string v0, "sqlite_error"

    iput-object v0, p0, Lwa/b$a;->b:Ljava/lang/String;

    iput-object p1, p0, Lwa/b$a;->c:Ljava/lang/String;

    iput-object p2, p0, Lwa/b$a;->d:Ljava/lang/Object;

    return-void
.end method

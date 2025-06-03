.class public final Ln3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ln3/f;

.field public b:Ljava/util/ArrayList;

.field public c:Ln3/b;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ln3/a$a;->a:Ln3/f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ln3/a$a;->b:Ljava/util/ArrayList;

    iput-object v0, p0, Ln3/a$a;->c:Ln3/b;

    const-string v0, ""

    iput-object v0, p0, Ln3/a$a;->d:Ljava/lang/String;

    return-void
.end method

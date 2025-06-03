.class public final Lb6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public a:Ljava/lang/Boolean;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lb6/f;->a:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Lb6/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lb6/f;->a:Ljava/lang/Boolean;

    sget-object v0, Lb6/g;->c:Lb6/g;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-boolean v0, p1, Lb6/g;->a:Z

    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lb6/f;->a:Ljava/lang/Boolean;

    .line 4
    iget-object p1, p1, Lb6/g;->b:Ljava/lang/String;

    .line 5
    iput-object p1, p0, Lb6/f;->b:Ljava/lang/String;

    return-void
.end method

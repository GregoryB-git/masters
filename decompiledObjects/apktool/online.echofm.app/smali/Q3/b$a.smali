.class public LQ3/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/b;->c()Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ljava/util/Iterator;

.field public final synthetic p:LQ3/b;


# direct methods
.method public constructor <init>(LQ3/b;Ljava/util/Iterator;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/b$a;->p:LQ3/b;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/b$a;->o:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LQ3/b$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LQ3/b$a$a;-><init>(LQ3/b$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.class public final Ln6/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln6/f;->a(Ljava/util/Iterator;)Ln6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln6/f$a;->a:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Ln6/f$a;->a:Ljava/util/Iterator;

    .line 2
    .line 3
    return-object v0
.end method

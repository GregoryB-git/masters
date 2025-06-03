.class public final Luc/g$a;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luc/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final a:Luc/g$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Luc/g$a;

    invoke-direct {v0}, Luc/g$a;-><init>()V

    sput-object v0, Luc/g$a;->a:Luc/g$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic f(Lqc/f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

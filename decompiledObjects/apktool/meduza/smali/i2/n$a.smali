.class public final Li2/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:Li2/n$a;

.field public static b:Li2/n$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/n$a;

    invoke-direct {v0}, Li2/n$a;-><init>()V

    sput-object v0, Li2/n$a;->a:Li2/n$a;

    sget-object v0, Li2/n$a$a;->a:Li2/n$a$a;

    sput-object v0, Li2/n$a;->b:Li2/n$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

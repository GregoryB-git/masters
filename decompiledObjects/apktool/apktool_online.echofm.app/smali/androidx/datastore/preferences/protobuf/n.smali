.class public abstract Landroidx/datastore/preferences/protobuf/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/n;->c()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Landroidx/datastore/preferences/protobuf/n;->a:Ljava/lang/Class;

    return-void
.end method

.method public static a()Landroidx/datastore/preferences/protobuf/o;
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/n;->a:Ljava/lang/Class;

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "getEmptyRegistry"

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/n;->b(Ljava/lang/String;)Landroidx/datastore/preferences/protobuf/o;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    sget-object v0, Landroidx/datastore/preferences/protobuf/o;->e:Landroidx/datastore/preferences/protobuf/o;

    return-object v0
.end method

.method public static final b(Ljava/lang/String;)Landroidx/datastore/preferences/protobuf/o;
    .locals 3

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/n;->a:Ljava/lang/Class;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, p0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    const/4 v0, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/o;

    return-object p0
.end method

.method public static c()Ljava/lang/Class;
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "androidx.datastore.preferences.protobuf.ExtensionRegistry"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
